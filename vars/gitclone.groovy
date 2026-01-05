def call(Map config = [:]) {

    def repoUrl = config.repoUrl ?: error("repoUrl is required")
    def branch  = config.branch ?: 'main'

    echo "Cloning repository: ${repoUrl}"
    echo "Branch: ${branch}"

    git(
        url: repoUrl,
        branch: branch,
        changelog: false,
        poll: false
    )
}
