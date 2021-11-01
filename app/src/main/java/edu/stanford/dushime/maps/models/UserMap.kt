package edu.stanford.dushime.maps.models

import java.io.Serializable

data class UserMap (val title : String, val places : List<Place>) : Serializable {
}