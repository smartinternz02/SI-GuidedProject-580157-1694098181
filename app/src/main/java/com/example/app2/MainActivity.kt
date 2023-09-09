package com.example.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.layout.Column
import com.example.app2.ui.theme.App2Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.ImeAction
import com.example.app2.ui.theme.App2Theme
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.getValue



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppContent()
            }
        }
    }

@Composable
fun MyAppContent () {
    Column {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        val Default: KeyboardOptions
        Text(text = "Username")
        TextField(value = username, onValueChange = { newUsername ->
            username = newUsername
        },
            leadingIcon = {
                Image(
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = "Star Icon"
                )
            },
            label = {
                Text(text = "Your label")
            }
        )
        Text(text = "Password")
        TextField(
            value = password,
            onValueChange = { newPassword ->
                password = newPassword
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            placeholder = {
                Text(text = "Your Password")
            }
        )
        Button(onClick = {}) {
            Text(text = "Sign In")
        }
    }
}
