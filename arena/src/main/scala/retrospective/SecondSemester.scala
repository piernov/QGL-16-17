package retrospective
import championships._
import eu.ace_design.island.arena.{Retrospective, Run}
import library.SI3

object SecondSemester extends Retrospective with SI3 {

  override val outputDir = "championships/_retro_qgl_2"
  override val weeks: Set[Run] = Set(Week05, Week06)

  trigger

}
