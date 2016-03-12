
val fileContent = io.Source.fromFile("/Users/janisrumnieks/IdeaProjects/RPDAnalyser/RPDParser/src/DEV.udml").mkString
val parser = new RPDParser(fileContent)
println (parser.numberOfJoins)

//"""DECLARE ROLE RELATIONSHIP(.*)AS """.r.findAllMatchIn(fileContent).toList
//"""DECLARE ROLE RELATIONSHIP(?:.*)DECLARE ROLE(?:.*)ON ENTITY(?: +)"(.+)"."(.+)"(?: +)MULTIPLICITY(.+)PRIVILEGES""".r.findAllMatchIn(fileContent).toList

val x = """(?s)DECLARE ROLE RELATIONSHIP(?:.*?)DECLARE ROLE(?:.*?)ON ENTITY(?: +?)"(.+?)"."(.+?)"(?: +?)MULTIPLICITY""".r.findFirstMatchIn(fileContent)
