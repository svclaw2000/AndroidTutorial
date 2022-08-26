package kr.co.alm.mobile_tutorial.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RepositoryHistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
)
