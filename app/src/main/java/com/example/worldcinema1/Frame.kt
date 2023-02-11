package com.example.worldcinema1

data class Frame(val imageId:Int)
class FrameList{val list = arrayListOf(Frame(R.drawable.frame1),
    Frame(R.drawable.frame2),
    Frame(R.drawable.frame3),
    Frame(R.drawable.frame1),
    Frame(R.drawable.frame2),
    Frame(R.drawable.frame3))}
