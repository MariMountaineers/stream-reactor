package com.datamountaineer.streamreactor.temp


/**
  * Created by carolinaloureiro on 21/04/2017.
  */
trait AllowParallelizationSettings extends BaseSettings{
  val allowParallelConstant: String

  def getAllowParallel = getBoolean(allowParallelConstant)
}
