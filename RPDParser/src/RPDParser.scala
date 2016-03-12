import java.awt.geom.Area

/**
  * Created by janisrumnieks on 10/03/2016.
  */
class RPDParser(rpdBody: String) {

/**
 * Business Layer joins
 *
 *  all_logical_joins = re.findall('DECLARE ROLE RELATIONSHIP.+?DECLARE ROLE.+?ON ENTITY(?: +?)"(.+?)"."(.+?)"(?: +?)MULTIPLICITY(.+?)PRIVILEGES.+?DECLARE ROLE.+?ON ENTITY(?: +?)".+?"."(.+?)"(?: +?)MULTIPLICITY(.+?)PRIVILEGES', self.rpd_udml_content, re.DOTALL)
 * 0 - Subject Area
 * 1 - table name 1
 * 2 - join multiplicity, table 1 e.g. "ZERO TO 0", "0 to 0", "ZERO TO MANY"
 * 3 - table name 2
 * 4 - join multiplicity, table 2
 *
 *
 */
  def numberOfJoins: Int = {
//  val businessRelationships = """DECLARE ROLE RELATIONSHIP.+?DECLARE ROLE.+?ON ENTITY(?: +?)"(.+?)"."(.+?)"(?: +?)MULTIPLICITY(.+?)PRIVILEGES.+?DECLARE ROLE.+?ON ENTITY(?: +?)".+?"."(.+?)"(?: +?)MULTIPLICITY(.+?)PRIVILEGES""".r("subjectArea", "table1", "table1Multiplicity", "table2", "table2Multiplicity")
  val businessRelationships = """DECLARE ROLE RELATIONSHIP.+?DECLARE ROLE""".r
  val resultLength = businessRelationships.findAllMatchIn(rpdBody).length
  resultLength
  }

}
