package com.xiuye.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,
reason="file not found"
		)
public class UploadException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = -4842547086706147949L;

}
