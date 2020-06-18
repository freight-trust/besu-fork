package io.iohk.ethereum.consensus
package atomixraft

import akka.actor.{ActorRef, PoisonPill}
import io.iohk.ethereum.consensus.atomixraft.AtomixRaftForger.Msg

// a new class to avoid "reflective access of structural type member" errors ...
final class AtomixRaftForgerRef extends Ref[ActorRef] {
  private[this] def send(msg: AnyRef): Unit = run(_ ! msg)

  def !(msg: Msg): Unit = send(msg)

  def kill(): Unit = send(PoisonPill)
}
