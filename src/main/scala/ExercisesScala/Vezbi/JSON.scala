package ExercisesScala.Vezbi

import play.api.libs.json.{JsBoolean, JsError, JsNumber, JsObject, JsString, JsSuccess, JsValue, Json, Reads, Writes}

object JSON extends App{

  val input2: String ="""{
    "Drzava":{
    "ime" : "Makedonija",
    "gradovi" : [{
      "ime": "Skopje",
      "ZIP" : 1000,
      "ulici": ["Todor Aleksandrov", "Socijalistichka Zora", "Josif Kovacev"],
      "populacija" : 100000
    }],
    "populacija":2000000,
    "EU" : false
  }
  }""" // ova ni stasuva na input ROJSon



  val obj3: JsObject =Json.obj("ime" -> JsString("Makedonija"),
                                                  "gradovi" -> Seq(Json.obj(
                                                       "ime" -> JsString("Skopje"),
                                                      "zip" -> JsNumber(1000),
                                                      "ulici" -> Seq("Todor Aleksandrov", "Socijalistichka Zora", "Josif Kovacev"),
                                                      "populacija" -> JsNumber(100000)),
                                                    Json.obj(
                                                    "ime" -> JsString("Prilep"),
                                                      "zip" -> JsNumber(1200),
                                                     "ulici" ->Seq("UlicaMica", "Petar Arsov", "Goce Delchev"),
                                                      "populacija" -> JsNumber(45000)
                                                  )),
                                                  "populacija" -> JsNumber(2000000),
                                                  "eu" -> JsBoolean(false))//vaka se pravi RoJson

  def stringToJSObject(str : String): JsObject = {
    Json.parse(str).as[JsObject]  //1.NACHIN konvertnat string vo JsObject, prvo so parse na Stringot za da imam namesto String JsValue pa posle JsObject
  }
  println(stringToJSObject(input2))


  def simpleInputToJsObject(ime:String, prezime:String, age:Int): JsObject = {
    Json.obj("ime" ->ime,
      "prezime"-> prezime,
      "age"-> age) //2.NACHIN zatoa shto inputot moze da bide daden vo razlichen format zatoa imame nachini da kreirame JsObject
  }
  println(simpleInputToJsObject("PRVO IME", "VTORO IME", 99))


  println(obj3)

  case class Drzava(ime:String, gradovi:Seq[Grad], populacija: Int, eu:Boolean)

  case class Grad(ime:String, zip: Int, ulici: Seq[String], populacija: Int)


  implicit val filterTasksReads: Reads[Grad] = Json.reads[Grad]
  implicit val filterTasksReads2: Reads[Drzava] = Json.reads[Drzava]
  implicit val GradnWrites = Json.writes[Grad]
  implicit val DrzavaWrites =Json.writes[Drzava]


  val u: JsObject = obj3.validate[Drzava] match {
    case JsSuccess(d, _) => {
      promeniIVrati(d)
    }
    case e: JsError => JsError.toJson(e) //ova go pravam od bezbednosni prichini za vo sluchaj da imam plus minus atribut ili dr ime na atributot da sum go zgreshila
  }
  println("OVA E BITNO ")
  println(u)

  def promeniIVrati(drzava:Drzava):JsObject = {
    val smenetiGradovi: Seq[Grad] = for (grad<-drzava.gradovi)
    yield {
      grad.copy(zip=50000) // za sekoj grad napravi kopija od gradovi so smeneto zip
    }

    val drzava1=drzava.copy(gradovi = smenetiGradovi)
    val json1 = Json.toJson(drzava1)
     json1.as[JsObject] //tuka drzava1 ja imam konvertnato od case clasa vo object
  }


  val inp: String = """{"name":"John", "age":30, "city":"New York"}"""

  val jobj: JsValue =Json.parse(inp)

  println(jobj)


  var obj: JsObject = Json.obj("name" -> "John",
                                "age"->"23",
                                "city"->"New York") //kreiram JSon obj i toa e identichno so toa shto go primam

 /* val podatociZaDrzava=obj3 \\"Drzava"
  println(podatociZaDrzava)

  val imeGradovi=(obj3 \ "Drzava" \ "gradovi" \ "ime").asOpt[String]  //namesto as[String] pobezbedno e asOpt vo sluchaj da go pogreshime imeto na atributot asOpt nema da frli greshka kje vrati None
  println(imeGradovi)


  val ulici=(obj3 \ "Drzava"\ "gradovi" \ "ulici")
  println(ulici)

    NAMESTO OVA SE KORISTAT CASE CLASSI
    */

}
