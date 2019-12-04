package part3Udemy

object TuplesAndMaps extends App {

  def add(network: Map[String, Set[String]] , person:String) : Map[String, Set[String]]=
    network + (person -> Set())  //dodavanje nov chovek vo mrezata

  def friend(network: Map[String, Set[String]], a: String, b: String) : Map[String, Set[String]]={
    val friendsA=network(a)
    val friendsB=network(b)

    network + (a-> (friendsA +b)) + (b->(friendsB+a))    //dodavanje prijatel vo listata
  }

  def unfriend(network: Map[String, Set[String]], a: String, b: String) : Map[String, Set[String]]={
    val friendsA=network(a)
    val friendsB=network(b)
    network + (a-> (friendsA -b)) + (b->(friendsB-a))    //brishenje prijatel
  }

  val empty: Map[String, Set[String]]= Map() //prazna mapa
  val network=add(add(empty, "Bob"), "Mary") //dva add za da dodadam 2 lichnosti vo mrezata
  println(network)
  println(friend(network, "Bob", "Mary"))
  println(unfriend(friend(network, "Bob", "Mary"), "Bob", "Mary"))

  //za tri lichnosti vo mrezata:

  val people=add(add(add(empty, "Bob"), "Mary"), "Jim")

  def nFriends(network: Map[String, Set[String]], person:String) : Int=
    if(!network.contains(person)) 0
    else network(person).size  //f-cija koja go vrakja brojot na prijarteli

  def nPeopleWithNoFriends(network: Map[String, Set[String]]): Int=
    network.filterKeys(k => network(k).isEmpty).size   //f-cija koja kje gi vrati site lugje na koi listata so prijateli im e 0, i .size kje ni gi vrati kolku se




}
