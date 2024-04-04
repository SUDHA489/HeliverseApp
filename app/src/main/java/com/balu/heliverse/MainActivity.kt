package com.balu.heliverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.balu.heliverse.ui.theme.HeliverseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeliverseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPage()
                }
            }
        }
    }
}
@Composable
fun MainPage(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription ="background image",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo name"
            )
        }
        Column (
            modifier = Modifier
                .fillMaxSize().fillMaxWidth()
                .padding(end = 5.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.messageleft),
                    contentDescription =null,
                    modifier = Modifier.width(250.dp)
                )
                Text(text = "Are U 14 Years Or Older?",
                    fontWeight = FontWeight.Bold
                )
            }
                Box {
                    Card(
                        modifier = Modifier.padding(start = 120.dp).padding(bottom = 120.dp).padding(end=40.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .width(300.dp)
                            .height(250.dp).align(Alignment.CenterEnd)
                    ){
                        Column(
                            modifier = Modifier.padding(15.dp)
                        ){
                            Text(text = "By Clicking Continue, I Agree That I Am Atleast 14 Years Old",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Button(onClick = {}, modifier = Modifier.padding(10.dp)) {
                                Text(text = "Yes,Continue")
                            }
                            Button(onClick = {}, modifier = Modifier.padding(10.dp)) {
                                Text(text = "No,I'm Not 14")
                            }
                        }
                    }
                    Image(painter = painterResource(id = R.drawable.terms),
                        contentDescription ="person logo",
                        modifier = Modifier
                            .width(150.dp)
                            .height(600.dp).padding(bottom = 58.dp).padding(start = 10.dp),
                        contentScale = ContentScale.FillHeight
                    )
                    Image(painter = painterResource(id = R.drawable.platform),
                        contentDescription = "base photo logo",
                        modifier = Modifier.align(Alignment.BottomCenter).padding(end=35.dp)
                    )
            }
        }
    }
}
@Preview
@Composable
fun PreviewMainPage(){
    MainPage()
}
