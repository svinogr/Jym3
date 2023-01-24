package info.upump.jym.db

import androidx.lifecycle.LiveData

interface RepoActions<T> {
    fun getAll(): List<T>
    fun save(item: T): T
}