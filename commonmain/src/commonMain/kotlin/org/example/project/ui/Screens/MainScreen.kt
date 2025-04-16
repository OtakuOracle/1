package org.example.project.ui.Screens

import org.example.project.ViewModel.TimerViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class MainScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val timerViewModel = TimerViewModel()

        val buttonSize = Modifier
            .width(400.dp)
            .height(80.dp)

        Scaffold(
            topBar = { MainWindowTopBar() },
            bottomBar = { MainWindowBottomBar(timerViewModel) }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .padding(horizontal = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick = { navigator.push(RunnerScreen(timerViewModel)) },
                        modifier = buttonSize,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text("Я хочу стать бегуном",
                            fontSize = 16.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { },
                        modifier = buttonSize,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text("Я хочу стать спонсором бегуна",
                            fontSize = 16.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { navigator.push(MoreInfoScreen(timerViewModel)) },
                        modifier = buttonSize,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Я хочу узнать больше о событии",
                            fontSize = 16.sp
                        )
                    }
                }


                Button(
                    onClick = { navigator.push(Login(timerViewModel)) },
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .height(65.dp)
                        .padding(end = 16.dp, bottom = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "Login", color = Color.Black)
                }
            }
        }
    }

    @Composable
    private fun MainWindowTopBar() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "MARATHON SKILLS 2016",
                fontSize = MaterialTheme.typography.h4.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Москва, Россия\nсреда 21 октября 2016",
                textAlign = TextAlign.Center,
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                fontStyle = FontStyle.Italic,
                color = Color.LightGray
            )
        }
    }

    @Composable
    private fun MainWindowBottomBar(timerViewModel: TimerViewModel) {
        val remainingTime = timerViewModel.remainingTime.collectAsState().value

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = remainingTime,
                color = Color.White)
        }
    }
}
