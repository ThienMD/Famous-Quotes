TAG = 1.0.7

release:
	gradle assembleRelease

publish:
	gradle publishReleasePublicationToMavenRepository

tag:
	git tag -a $(TAG) -m "Release $(TAG)"
	git push origin $(TAG)