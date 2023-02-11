package com.example.worldcinema1

data class Character(val imageId2:Int, val title:String, val description:String)
class CharacterList{val list = arrayListOf(Character(
    R.drawable.character1, "Jesper Johansson", "Jesper Johansson is a spoiled" +
            " and lazy postman who becomes the main hero in the animated movie Klaus."),
    Character(
        R.drawable.character2, "Klaus", "Mr. Klaus is an elderly, mysterious" +
                " carpenter who makes handmade toys for children."),
    Character(
        R.drawable.character3, "Alva", "Alva is a teacher and a fishmonger."),
    Character(
        R.drawable.character4, "Mr. Ellingboe", "Mr. Ellingboe is the" +
                " senseless leader of the Ellingboe clan and one of the main villains" +
                " of Klaus."))}
