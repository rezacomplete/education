```
./gradlew clean build
```
```
docker build . -t rezacomplete/education
```
```
docker push docker.io/rezacomplete/education
```
```
kubectl apply -f workloads.yml
```
```
kubectl apply -f services.yml
```
```
curl --request GET 'http://localhost:30022/users/rezacomplete@gmail.com/educations' 
```
