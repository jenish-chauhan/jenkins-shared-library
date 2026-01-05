def call(String url , String branch) {

  

    echo "Cloning repository: ${url}"
    echo "Branch: ${branch}"

    git(
        url: url,
        branch: branch,
        changelog: false,
        poll: false
    )
}
