package com.yudhaaryosapplication.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yudhaaryosapplication.app.Api.ApiConfig
import com.yudhaaryosapplication.app.databinding.ActivityLoginBinding
import com.yudhaaryosapplication.app.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val morty = findViewById<RecyclerView>(R.id.rv_morty)

        ApiConfig.getService().getMorty().enqueue(object : Callback<ResponseMorty>{
            override fun onResponse(call: Call<ResponseMorty>, response: Response<ResponseMorty>) {
                if (response.isSuccessful){
                    val responseMorty = response.body()
                    val dataMorty = responseMorty?.results
                    val mortyAdapter = MortyAdapter(dataMorty)
                    morty.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        mortyAdapter.notifyDataSetChanged()
                        adapter = mortyAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseMorty>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }

        })

    }
}
//package com.yudhaaryosapplication.app.modules
//
//import android.content.ClipData.Item
//import android.opengl.Visibility
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.yudhaaryosapplication.app.R
//import android.widget.Toast
//import android.preference.PreferenceManager
//import com.yudhaaryosapplication.app.CustomInfoWindow
//import com.yudhaaryosapplication.app.ModelMain
//import org.json.JSONException
//import org.json.JSONObject
//import org.osmdroid.config.Configuration
//import org.osmdroid.tileprovider.tilesource.TileSourceFactory
//import org.osmdroid.util.GeoPoint
//import org.osmdroid.views.CustomZoomButtonsController
//import org.osmdroid.views.MapController
//import org.osmdroid.views.MapView
//import org.osmdroid.views.overlay.Marker
//import org.osmdroid.views.overlay.OverlayItem
//import java.nio.charset.StandardCharsets
//import java.io.IOException
//
//class MainActivity : AppCompatActivity() {
//    var modelMainList :MutableList<ModelMain> = ArrayList()
//    lateinit var mapController: MapController
//    lateinit var overlayItem: ArrayList<OverlayItem>
//    lateinit var mapView: MapView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        Configuration.getInstance().load(this,PreferenceManager.getDefaultSharedPreferences(this))
//
//        val geoPoint = GeoPoint(-7.7732735, 110.3854703)
//        mapView.setMultiTouchControls(true)
//        mapView.controller.animateTo(geoPoint)
//        mapView.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE)
//        mapView.zoomController.setVisibility(CustomZoomButtonsController.Visibility.NEVER)
//
//        mapController = mapView.controller as MapController
//        mapController.setCenter(geoPoint)
//        mapController.zoomTo(15)
//
//        getLocationMarker()
//    }
//    private fun getLocationMarker(){
//        try{
//            val stream = assets.open("sample_maps.json")
//            val size = stream.available()
//            val buffer = ByteArray(size)
//            stream.read(buffer)
//            stream.close()
//            val strContent = String(buffer, StandardCharsets.UTF_8)
//            try{
//                val jsonObject = JSONObject(strContent)
//                val jsonArrayResult = jsonObject.getJSONArray("result")
//                for (i in 0 until jsonArrayResult.length()){
//                    val jsonObjectResult = jsonArrayResult.getJSONObject(i)
//                    val modelMain = ModelMain()
//                    modelMain.strName = jsonObjectResult.getString("name")
//                    modelMain.strVicinity = jsonObjectResult.getString("vicinity")
//
//                    val jsonObjectGeo = jsonObjectResult.getJSONObject("geometry")
//                    val jsonObjectLoc = jsonObjectGeo.getJSONObject("location")
//                    modelMain.latloc = jsonObjectLoc.getDouble("lat")
//                    modelMain.longloc = jsonObjectLoc.getDouble("lng")
//                    modelMainList.add(modelMain)
//                }
//                initMarker(modelMainList)
//            } catch (e: JSONException) {
//                e.printStackTrace()
//            }
//        } catch (ignored: IOException){
//            Toast.makeText(
//                this@MainActivity,
//                "Oops, ada yanag tidak beres. Coba ulangi lagi",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//
//        }
//    }
//    private fun initMarker(modelList: List<ModelMain>){
//        for (i in modelList.indices) {
//            overlayItem = ArrayList()
//            overlayItem.add(
//                OverlayItem(
//                    modelList[i].strName, modelList[i].strVicinity, GeoPoint(
//                        modelList[i].latloc, modelList[i].longloc
//                    )
//
//                )
//            )
//            val info = ModelMain()
//            info.strName = modelList[i].strName
//            info.strVicinity = modelList[i].strVicinity
//
//            val marker = Marker(mapView)
//            marker.icon = resources.getDrawable(R.drawable.ic_place)
//            marker.position = GeoPoint(modelList[i].latloc,modelList[i].longloc)
//            marker.relatedObject = info
//            marker.infoWindow = CustomInfoWindow(mapView)
//            marker.setOnMarkerClickListener{item, arg1 ->
//                item.showInfoWindow()
//                true
//            }
//            mapView.overlays.add(marker)
//            mapView.invalidate()
//        }
//    }
//
//    public override fun onResume() {
//        super.onResume()
//        Configuration.getInstance().load(this,PreferenceManager.getDefaultSharedPreferences(this))
//            if (mapView != null) {
//                mapView.onResume()
//            }
//
//    }
//
//    public override fun onPause() {
//        super.onPause()
//        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this))
//        if (mapView != null) {
//            mapView.onPause()
//        }
//    }
//}
