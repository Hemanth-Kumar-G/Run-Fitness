package com.hemanth.runfitness.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM `running-table` ORDER BY timestamp DESC")
    fun getAllRunsSortByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM `running-table` ORDER BY timeInMillis DESC")
    fun getAllRunsSortByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM `running-table` ORDER BY caloriesBurned DESC")
    fun getAllRunsSortByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM `running-table` ORDER BY avgSpeedInKMH  DESC")
    fun getAllRunsSortByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM `running-table` ORDER BY distanceInMeters DESC")
    fun getAllRunsSortByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) from `running-table`")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) from `running-table`")
    fun getTotalCaloriesBurned(): LiveData<Long>

    @Query("SELECT AVG(avgSpeedInKMH) from `running-table`")
    fun getTotalAvgSpeed(): LiveData<Float>

}
