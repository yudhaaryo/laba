//package com.yudhaaryosapplication.app
//import androidx.appcompat.app.AppCompatActivity
//import org.osmdroid.views.MapView
//import org.osmdroid.views.overlay.Marker
//import org.osmdroid.views.overlay.infowindow.InfoWindow
//import com.yudhaaryosapplication.app.databinding.ActivityLayoutTooltipBinding
//
//
//
//
//class CustomInfoWindow(mapView: MapView?) : AppCompatActivity(), InfoWindow(R.layout.activity_layout_tooltip,mapView){
//    private lateinit var binding: ActivityLayoutTooltipBinding
//    override fun onOpen(item: Any?) {
//        val marker = item as Marker
//        val infoWindowData = marker.relatedObject as ModelMain
//
//        // Inflate binding untuk info window layout
//        binding = ActivityLayoutTooltipBinding.inflate(layoutInflater)
//
//
//        // Gunakan binding untuk mengakses view
//        binding.tvNamaLokasi.text = infoWindowData.strName
//        binding.tvAlamat.text = infoWindowData.strVicinity
//        binding.imageClose.setOnClickListener {
//            marker.closeInfoWindow()
//        }
//
//        // Set mView sebagai root view dari binding
//        val mView = binding.root
//    }
//
//    override fun onClose() {
//        TODO("Not yet implemented")
//    }
//
//}