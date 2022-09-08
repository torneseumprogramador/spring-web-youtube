export USER=root
export PASSWORD=root 
export DATABASE_URL='localhost' 
./mvnw package -Dmaven.test.skip
java -jar target/*.jar