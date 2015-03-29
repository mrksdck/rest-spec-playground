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
####mock server
* [api-mock]() – usage : `api-mock blueprint.md`
* [drakov]() – usage : `drakov -f blueprint.md`
* [raml-mockup](https://github.com/gextech/raml-mockup) – usage `raml-mockup api.raml`

####verify endpoints
* [abao](https://github.com/cybertk/abao) – usage : `abao api.raml http://localhost:8080/`
* [dredd](https://github.com/apiaryio/dredd) – usage : `dredd blueprint.md http://localhost:8080`

####codegen
* [raml to jaxrs](raml-to-jaxrs) – creates jersey interfaces – usage `mvn generate-sources`
* [swagger-codegen](../legacy-workflow/codegen) – creates server/client code – usage `mvn swagger-codegen:generate`