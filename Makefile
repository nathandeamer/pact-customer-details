SHELL:=/bin/bash

GITHUB_COMMIT_HASH?=$(shell git rev-parse --verify HEAD)

ENV?=dev

compile:
	./gradlew clean build

pact-provider:
	./gradlew -Ppact.verifier.publishResults=true -Ppact.provider.version=${GITHUB_COMMIT_HASH} pactProvider
