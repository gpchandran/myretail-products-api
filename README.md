# MyRetail-API

MyRetail API and Beyond!

## Technology stack

* * Server Side - Java 8, Spring, Spring Boot, Spring MVC Rest , Spring Data JPA  and more
* Data Store - Mongo DB and MongoBee
* Client Side - Angular JS, Bootstrap and Swagger-UI


## Development
Run the following commands in from command prompt

    ./mvnw
    
Then navigate to [myRetail Products API Documentation](http://localhost:8080/swagger-ui/index.html) in your browser.

## Building for production

To optimize the myretailapi client for production, run:

    ./mvnw -Pprod clean package

This will concatenate and minify CSS and JavaScript files. It will also modify `index.html` so it references
these new files.

To ensure everything worked, run:

    java -jar target/*.war
    
## Continuous Integration

To setup this project in Jenkins, use the following configuration:

* Project name: `myretail-api`
* Source Code Management
    * Git Repository: `https://github.com/gpchandran/myretail-products-api.git`
    * Branches to build: `*/master`
    * Additional Behaviours: `Wipe out repository & force clone`
* Build Triggers
    * Poll SCM / Schedule: `H/5 * * * *`
* Build
    * Invoke Maven / Tasks: `-Pprod clean package`
* Post-build Actions
    * Publish JUnit test result report / Test Report XMLs: `build/test-results/*.xml`

[JHipster]: https://jhipster.github.io/
[Gatling]: http://gatling.io/
[Node.js]: https://nodejs.org/
[Bower]: http://bower.io/
[Gulp]: http://gulpjs.com/
[BrowserSync]: http://www.browsersync.io/
[Karma]: http://karma-runner.github.io/
[Jasmine]: http://jasmine.github.io/2.0/introduction.html
[Protractor]: https://angular.github.io/protractor/
