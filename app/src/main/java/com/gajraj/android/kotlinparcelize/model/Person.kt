package com.gajraj.android.kotlinparcelize.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Gajraj on 5/30/2018.
 */
@Parcelize
data class Person(var id: Int, var name: String, var address: String, var age: Int) : Parcelable {
}