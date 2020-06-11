package first_git_package;

public class Hello_World {
public static void main(String[] args) {
	/*Notes: GitHub Day_1
When we have a new version, it is called commit
Local repository will be always in your machine 
Remote repository is always on the cloud (GitHub)
WHere do type your scripts?
Eclipse
Staging area ==> We will see our untracked files and we will send to our local repository ==> we will save them in our local repository.
 When all contributors are trying to collaborate and share their codes on the same files and lines, then they might have merge conflicts
 Local repository represents your machine
 Remote repository is the one on the cloud
 What is directory?
 The place where we have our folders and files
 Our commands 
git init ==> to initialize an empty git repository
git status ==> to see the status of all files and folders
No commits yet
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .classpath
        .project
        .settings/
nothing added to commit but untracked files present (use "git add" to track)
PS C:\Users\sam\eclipse-workspace\git_project>
we will bring all files to our staging area
git add .  ==> will add all your files and folder to your staging area
git commit -m "First commit"  ==> will save all your files to your local repository 
master (root-commit) e9f70c7] First commit
 3 files changed, 39 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
PS C:\Users\sam\eclipse-workspace\git_project>
git remote add origin https://github.com/HalilIbrahimHasan/git_project.git ==> we type this command and the link of our project and we make our local repo know about remote repository
remote master branch ==> this is your head where you will be sending (pushing ) your codes.
git push -u origin master ==> send and push your codes and changes to remote repo for the first time
If you got stuck there q+enter ==> :wq
git config credential.password "your passsword"
git config credential.username "your user name"
When you made your changes and type git status
Then you should see 
PS C:\Users\sam\eclipse-workspace\git_project> git status
On branch master
Your branch is up to date with 'origin/master'.
nothing to commit, working tree clean
PS C:\Users\sam\eclipse-workspace\git_project>

		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}



}

