package com.priscilla.compose.utils

import io.objectbox.query.PropertyQueryCondition
import io.objectbox.query.Query
import io.objectbox.query.QueryBuilder
import io.objectbox.query.QueryCondition
import java.lang.NullPointerException

/**
 * Created by Priscilla Cheung on 2021年11月11日22:28:04~
 */
object Store {

    /**
     * 单条录入
     * 默认情况下,新对象的id由ObjectBox分配,当一个新对象被放置时,它将被分配到下一个最高的可用ID~
     * 例如,如果在一个框中有一个ID为1的对象和另一个ID为100的对象,则放置的下一个新对象将分配ID 101~
     * 如果您尝试自己分配一个新ID并放置对象,ObjectBox将抛出一个错误~
     */
    inline fun <reified T> put(bean: T) {
        try {
            ObjectBox.store.boxFor(T::class.java).put(bean)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }
    }

    /**
     * 多条录入
     */
    inline fun <reified T> put(bean: List<T>) =
        ObjectBox.store.boxFor(T::class.java).put(bean)

    /**
     * 通过Id单条获取
     * @param id 查询的Id
     * @return 返回一个实体类
     */
    inline fun <reified T> get(id: Long): T = ObjectBox.store.boxFor(T::class.java).get(id)

    /**
     * 获取全部
     * @return 返回一个实体类集合
     */
    inline fun <reified T> getAll(): List<T> {
        return try {
            ObjectBox.store.boxFor(T::class.java).all
        }catch (e:RuntimeException){
            arrayListOf()
        }catch (e:java.lang.IllegalArgumentException){
            arrayListOf()
        }
    }

    /**
     * 通过Id删除单条
     */
    inline fun <reified T> remove(id: Long) {
        try {
            ObjectBox.store.boxFor(T::class.java).remove(id)
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
    }

    /**
     * 通过Id删除多条
     */
    inline fun <reified T> remove(id: List<Long>) {
        try {
            ObjectBox.store.boxFor(T::class.java).removeByIds(id)
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
    }

    /**
     * 删除全部
     */
    inline fun <reified T> removeAll() {
         try {
            ObjectBox.store.boxFor(T::class.java).removeAll()

        }catch (e:RuntimeException){
           e.printStackTrace()
        }catch (e:java.lang.IllegalArgumentException){
             e.printStackTrace()
         }
    }


    /**
     * 条件查询
     * Store.query<UserBean>(UserBean_.code.equal(MyApp.isLogin))
     */
    inline fun <reified T> query(propertyQueryCondition: PropertyQueryCondition<T>): List<T> {
        var info: ArrayList<T> = ArrayList<T>()
        ObjectBox.store.boxFor(T::class.java).query(propertyQueryCondition).build().apply {
            info.addAll(find())
            close()
        }
        return info
    }

    /**
     * 复杂筛选
     * Store.queryCreate<AcceptanceMaterialsBean>()
     *.order(AcceptanceMaterialsBean_.recordDate)
     *.build().start()
     */
    inline fun <reified T> queryCreate(
        propertyQueryCondition: QueryCondition<T>? = null,
    ): QueryBuilder<T> {
        return if(propertyQueryCondition != null) ObjectBox.store.boxFor(T::class.java).query(propertyQueryCondition)
        else ObjectBox.store.boxFor(T::class.java).query()
    }

    inline fun <reified T> Query<T>.start(): List<T> {
        var info: ArrayList<T> = ArrayList<T>()
        this.apply {
            info.addAll(find())
            close()
        }
        return info
    }


    /**
     * 获取数量
     */
    inline fun <reified T> count(): Long =
        ObjectBox.store.boxFor(T::class.java).count()

}