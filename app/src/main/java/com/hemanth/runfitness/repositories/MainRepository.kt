package com.hemanth.runfitness.repositories

import com.hemanth.runfitness.db.Run
import com.hemanth.runfitness.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(val runDao: RunDAO) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortByDate()

    fun getAllRunsSortByDistance() = runDao.getAllRunsSortByDistance()

    fun getAllRunsSortByTimeInMillis() = runDao.getAllRunsSortByTimeInMillis()

    fun getAllRunsSortByAvgSpeed() = runDao.getAllRunsSortByAvgSpeed()

    fun getAllRunsSortByCaloriesBurned() = runDao.getAllRunsSortByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalDistance() = runDao.getTotalDistance()

}