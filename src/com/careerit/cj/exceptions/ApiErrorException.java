package com.careerit.cj.exceptions;

import java.time.LocalDateTime;

public class ApiErrorException extends RuntimeException {

		private long errorCode;
		private String message;
		private LocalDateTime timeStamp;

		public ApiErrorException(long errorCode, String message, LocalDateTime timeStamp) {
			this.errorCode = errorCode;
			this.message = message;
			this.timeStamp = timeStamp;
		}

		@Override
		public String toString() {
			return String.format("ApiErrorException [errorCode=%s, message=%s, timeStamp=%s]", errorCode, message,
					timeStamp);
		}
		
		
		
}
