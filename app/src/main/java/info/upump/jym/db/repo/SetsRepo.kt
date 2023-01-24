package info.upump.jym.db.repo

import android.content.Context
import info.upump.jym.App
import info.upump.jym.db.RepoActions
import info.upump.jym.db.entities.SetsEntity
import info.upump.jym.models.Sets

class SetsRepo private constructor(private var context: Context) : RepoActions<SetsEntity> {
    private val setsDao = App.db.setsDao()

    companion object {
        private var instance: SetsRepo? = null

        fun initialize(context: Context) {
            if (instance == null) {
                instance = SetsRepo(context)
            }
        }

        fun get(): RepoActions<SetsEntity> {
            return instance ?: throw IllegalStateException(" first need initialize repo")
        }
    }

    override fun getAll(): List<SetsEntity> {
        return setsDao.getAll()
    }

    override fun save(item: SetsEntity): SetsEntity {
        TODO("Not yet implemented")
    }
}