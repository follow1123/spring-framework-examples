rootProject.name = "spring-framework-examples"
include("ioc-container")
include("ioc-container:xml-based")
findProject(":ioc-container:xml-based")?.name = "xml-based"
include("ioc-container:annotation-based")
findProject(":ioc-container:annotation-based")?.name = "annotation-based"
include("ioc-container:code-based")
findProject(":ioc-container:code-based")?.name = "code-based"
