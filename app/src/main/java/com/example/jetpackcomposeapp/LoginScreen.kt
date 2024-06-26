package com.example.jetpackcomposeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "EN",
                    modifier = Modifier.padding(end = 8.dp)
                )

                Switch(
                    checked = false, // Default unchecked
                    onCheckedChange = { /* Logic can be added later */ }
                )

                Text(
                    text = "PL",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))

            Image(painter = painterResource(
                id = R.drawable.login_img),
                contentDescription = "Login Image",
                modifier =  Modifier.size(200.dp))


            Text(text = "Welcom Back!", fontSize = 28.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Login to your account")

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(text = "Email address")
            } )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(text = "Password")
            } )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {  }) {
                Text(text = "Login")

            }

            Spacer(modifier = Modifier.height(32.dp))


            Text(text = "Forgot Password?", modifier = Modifier.clickable {

            })

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Or sign in with")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Image(painter = painterResource(id = R.drawable.google), contentDescription = "Google",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable {
                            // gogole
                        })

                Image(painter = painterResource(id = R.drawable.meta), contentDescription = "Meta",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable {
                            // meta
                        })

            }
        }

}



