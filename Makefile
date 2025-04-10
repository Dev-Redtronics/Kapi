build-docker-docs-linux:
	./gradlew dokkaGenerate
	cd docs && docker build -t kapi -f Dockerfile .

build-docker-docs-windows:
	.\gradlew dokkaGenerate
	cd docs && docker build -t kapi -f Dockerfile .
