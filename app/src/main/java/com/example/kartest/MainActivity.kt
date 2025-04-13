package com.example.kartest

// CleverTap SDK Imports
import com.clevertap.android.sdk.CleverTapAPI

// Android & Compose Imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kartest.ui.theme.KartestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Catching CleverTap Default Instance
        val cleverTapDefaultInstance = CleverTapAPI.getDefaultInstance(applicationContext)

        // UI layout
        enableEdgeToEdge()
        setContent {
            KartestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))

                        Button(onClick = {
                            // Updating profile
                            val profileUpdate = mapOf(
                                "Name" to "Karthen Push",
                                "Email" to "clevertap+push@gmail.com",
                                "Phone" to "1234567890",
                                "Gender" to "M"
                            )
                            cleverTapDefaultInstance?.onUserLogin(profileUpdate)
                            // Sending event with properties
                            val props = mapOf(
                                "Product ID" to 1,
                                "Product Name" to "CleverTap",
                                "Product Image" to "https://d35fo82fjcw0y8.cloudfront.net/2018/07/26020307/customer-success-clevertap.jpg",
                                "Email" to "clevertap+push@gmail.com"
                            )
                            cleverTapDefaultInstance?.pushEvent("Product Viewed", props)
                        }) {
                            Text("Product Viewed")
                        }
                    }
                }
            }
        }
    }
}