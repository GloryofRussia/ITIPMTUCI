class UserAccount:
    def __init__(self, username, email, password):
        self.username = username  
        self.email = email  
        self.__password = password  

    def set_password(self, new_password):
        if len(new_password) >= 8:  
            self.__password = new_password
            print("Пароль успешно изменен.")
        else:
            print("Ошибка: пароль должен быть длиной не менее 8 символов.")
    def check_password(self, password):
        return self.__password == password


user1 = UserAccount("john_doe", "john@example.com", "securepass123")

user1.set_password("newpassword456")

is_correct = user1.check_password("newpassword456")
print(f"Пароль правильный: {is_correct}")

is_correct = user1.check_password("wrongpassword")
print(f"Пароль правильный: {is_correct}")
