package exercises.part2oop

object ExamplesOOP extends App {
  val writer=new Writer("John", "Green", 1981)
  val novel=new Novel("Great Travel", 1998, writer)
  writer.fullName()
  println(novel.isWrittenBy(writer))
  println(novel.authorAge)

}

  class Writer(firstName:String, surname:String, val year:Int){
    def fullName():Unit={
    println(s"$firstName" + " " + s"$surname")
    }
  }

class Novel(name:String, yearOfRelease:Int, author:Writer){
  def authorAge = yearOfRelease - author.year
  def isWrittenBy(author:Writer) :Boolean= {
    if(author==this.author) true
    else false
  }//ne mora na metodite da im gi pishuvame return Types
  def copy(newYear:Int): Novel=new Novel(name,newYear, author)  //nova instanca od Novel kje vrati so smeneta godina
}
