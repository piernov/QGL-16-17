package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  def all: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "iadb" -> classOf[fr.unice.polytech.si3.qgl.iadb.Explorer]
  )

  def players = all

}
