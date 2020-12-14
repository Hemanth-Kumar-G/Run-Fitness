package com.hemanth.runfitness.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter
    fun fromBitmap(bmp: Bitmap): ByteArray {
        val outPutString = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outPutString)
        return outPutString.toByteArray()
    }

    @TypeConverter
    fun toBitMap(byteArray: ByteArray): Bitmap =
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
}