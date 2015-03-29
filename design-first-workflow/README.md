# Design First Workflow
first create a spec with editor or online tools

## Possible Worklow
1. Design first in editor
2. generate mock server
3. generate client
4. create integration tests
5. implement API
6. test API with integration tests

###Example specs:
* [swagger](swagger.json)
* [raml](api.raml)

##helpful tools
* [abao](https://github.com/cybertk/abao) – verifies endpoints – usage : `abao api.raml http://localhost:8080/`
* [raml-mockup](https://github.com/gextech/raml-mockup) – creates mock service – usage `raml-mockup api.raml`
* [raml to jaxrs](raml-to-jaxrs) – creates jersey interfaces – usage `mvn generate-sources`
