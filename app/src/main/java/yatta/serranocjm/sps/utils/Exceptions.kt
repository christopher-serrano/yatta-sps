package yatta.serranocjm.sps.utils

import java.io.IOException

class NoConnectivityException(message: String) : IOException(message)
class ApiException(message: String) : IOException(message)
