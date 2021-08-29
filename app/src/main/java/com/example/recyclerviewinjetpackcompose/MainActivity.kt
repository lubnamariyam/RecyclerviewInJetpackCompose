package com.example.recyclerviewinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerviewinjetpackcompose.model.Person
import com.example.recyclerviewinjetpackcompose.repository.PersonRepository
import com.example.recyclerviewinjetpackcompose.ui.theme.RecyclerviewInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerviewInJetpackComposeTheme {
                
                val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()
                
                LazyColumn(contentPadding = PaddingValues(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)){
                    items(items = getAllData){
                        Person ->  CustomItem(person = Person)
                    }
                }

                }
            }
        }
    }




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecyclerviewInJetpackComposeTheme {

    }
}