package com.datamountaineer.streamreactor.temp

import com.datamountaineer.streamreactor.connect.errors.{ErrorPolicy, ErrorPolicyEnum}

trait ErrorPolicySettings extends BaseSettings {
  val errorPolicyConstant: String
  val retryIntervalConstant: String

  def getErrorPolicy: ErrorPolicy = ErrorPolicy(ErrorPolicyEnum.withName(getString(errorPolicyConstant).toUpperCase))

  def getRetryInterval: Int = getInt(retryIntervalConstant)
}
