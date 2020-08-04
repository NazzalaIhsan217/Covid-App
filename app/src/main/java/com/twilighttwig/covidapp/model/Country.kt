package com.twilighttwig.covidapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AllNegara( //<- "AllNegara" itu adalah Variable jadi kita terserah kita namain sebagai contoh "SemuaNegara"
	val Global: Dunia?, //<-yang kata "Globe" itu variable juga tetapi tidak boleh otak atik
						//maksudnya adalah harus sama dengan json
	val Countries: List<Negara>?
) : Parcelable

//region Data
@Parcelize
data class Dunia(
	val TotalConfirmed: String?,
	val TotalRecovered: String?,
	val TotalDeaths: String?
) : Parcelable

@Parcelize
data class Negara (
	val Country: String?,
	val Date: String?,
	val NewConfirmed: String?,
	val TotalConfirmed: String?,
	val TotalDeaths: String?,
	val NewDeaths: String?,
	val TotalRecovered: String?,
	val NewRecovered: String?,
	val CountryCode: String?
) : Parcelable

@Parcelize
data class InfoNegara(
	val Deaths: String?,
	val Confirmed: String?,
	val Recovered: String?,
	val Active: String?,
	val Date: String?
) : Parcelable
//endregion
