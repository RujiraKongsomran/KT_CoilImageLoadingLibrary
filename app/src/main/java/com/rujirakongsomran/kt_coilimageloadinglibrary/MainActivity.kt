package com.rujirakongsomran.kt_coilimageloadinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.rujirakongsomran.kt_coilimageloadinglibrary.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContentView(binding.root)

        binding.imageView1.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            //placeholder(R.drawable.ic_launcher_background)
            crossfade(true)
            crossfade(400)

            // transform to round corner and specify radius
            //transformations(RoundedCornersTransformation(100f))
            //transformations(CircleCropTransformation())
            //transformations(GrayscaleTransformation())
            //transformations(BlurTransformation(applicationContext,20f ))
            //transformations(BlurTransformation(applicationContext,20f ), RoundedCornersTransformation(50f))

        }

        imageView2.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            // transform to round corner and specify radius
            transformations(RoundedCornersTransformation(100f))
        }
        imageView3.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            transformations(CircleCropTransformation())
        }
        imageView4.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            transformations(GrayscaleTransformation())
        }
        imageView5.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            transformations(BlurTransformation(applicationContext, 20f))
        }
        imageView6.load("https://images.pexels.com/photos/57416/cat-sweet-kitty-animals-57416.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940") {
            transformations(
                BlurTransformation(applicationContext, 20f),
                RoundedCornersTransformation(50f)
            )
        }
    }
}