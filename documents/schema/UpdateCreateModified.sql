BEGIN
	set NEW.user_last_login = CURRENT_TIMESTAMP;  
	set NEW.created = CURRENT_TIMESTAMP;  
	set NEW.modified = CURRENT_TIMESTAMP; 
END