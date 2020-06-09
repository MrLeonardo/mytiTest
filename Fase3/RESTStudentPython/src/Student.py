class Student:
        
    def __init__(self, json):           
        self.__firstname = json["firstname"]
        self.__lastname = json["lastname"]
        self.__birthdate = json["birthdate"]
        self.__grades = json["grades"]
        
    def serialize(self):
        return {
            "firstname": self.__firstname,
            "lastname": self.__lastname,
            "birthdate": self.__birthdate,
            "grades": self.__grades,
        }
    
    @property
    def firstname(self):
        return self.__firstname
    
    @firstname.setter
    def firstname(self, firstname):
        self.__firstname = firstname
        
    @property
    def lastname(self):
        return self.__lastname
    
    @lastname.setter
    def lastname(self, lastname):
        self.__lastname = lastname
        
    @property
    def birthdate(self):
        return self.__birthdate
    
    @birthdate.setter
    def birthdate(self, birthdate):
        self.__birthdate = birthdate
        
    @property
    def grades(self):
        return self.__grades
    
    @grades.setter
    def grades(self, grades):
        self.__grades = grades       
        
    def __eq__(self, other):
        return (self.__firstname == other.firstname and 
                self.__lastname == other.lastname and 
                self.__birthdate == other.birthdate)
        
    def __hash__(self):
        return hash(self.__firstname + self.__lastname + self.__birthdate)