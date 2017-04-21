package com.datamountaineer.streamreactor.temp

import org.apache.kafka.common.config.ConfigException

import scala.util.{Failure, Success, Try}

trait ConsistencyLevelSettings extends BaseSettings {
  val consistencyLevelConstant: String

  def getConsistencyLevel[T <: Enum[T]](clazz: Class[T]): Option[T] = {

    val consistencyLevel = getString(consistencyLevelConstant) match {
      case "" => None
      case other =>
        Try(Enum.valueOf[T](clazz.asInstanceOf[Class[T]], other)) match {
          case Failure(e) => throw new ConfigException(s"'$other' is not a valid $consistencyLevelConstant. " +
            s"Available values are:${clazz.getEnumConstants.map(_.toString).mkString(",")}")
          case Success(cl) => Some(cl)
        }
    }

    consistencyLevel
  }
}
