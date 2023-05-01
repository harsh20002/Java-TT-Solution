## About

This repository is to add solutions of the questions discussed in Technical Training class (Java Batch).

## How to add your solutions?

Please follow below steps to add your solutions:


##### If you don't have git on your machine, [install it](https://docs.github.com/en/get-started/quickstart/set-up-git).

### 1. Fork this repository

Fork this repository by clicking on the fork button on the top of this page.
This will create a copy of this repository in your account.

### 2. Clone the repository

<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/clone.png" alt="clone this repository" />

Now clone the forked repository to your machine. Go to your GitHub account, open the forked repository, click on the code button and then click the _copy to clipboard_ icon 📋.

Open a terminal and run the following git command:

```
git clone "url you just copied"
```

where "url you just copied" (without the quotation marks) is the url to this repository (your fork of this project). See the previous steps to obtain the url.

<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/copy-to-clipboard.png" alt="copy URL to clipboard" />

For example:

```
git clone https://github.com/your-username/Java-TT-Solution.git
```

where `your-username` is your GitHub username. Here you're copying the contents of the Java-TT-Solution repository on GitHub to your computer.

### 3. Create a branch

Change to the repository directory on your computer (if you are not already there):

```
cd Java-TT-Solution
```

Now create a branch using the `git switch` command:

```
git switch -c your-new-branch-name
```

For example:

```
git switch -c aaditya-reverse-array-solution
```

### 4. Make necessary changes and commit those changes

Now got to the directory in which you want to add your code. For example, if you want to add solution related to Array, then move to Array directory and then move to the **directory of your name** (If directory of your name is not present then please make one, you can refer Aaditya Raj or Himanshu Kumar Singh folder for reference).

**Inside this directory(Your name folder) add the .java file of your code.**

Add those changes to the branch you just created using the `git add .` command: (there is a dot after add)

```
git add .
```
Now commit those changes using the `git commit` command:

```
git commit -m "Add Reverse array solution by Your-Name"
```

replacing `your-name` with your name.

### 5. Push changes to GitHub

Push your changes using the command `git push`:

```
git push -u origin your-branch-name
```

replacing `your-branch-name` with the name of the branch you created earlier.

<details>
<summary> <strong>If you get any errors while pushing, click here:</strong> </summary>

- ### Authentication Error
     <pre>remote: Support for password authentication was removed on August 13, 2021. Please use a personal access token instead.
  remote: Please see https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ for more information.
  fatal: Authentication failed for 'https://github.com/<your-username>/first-contributions.git/'</pre>
  Go to [GitHub's tutorial](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account) on generating and configuring an SSH key to your account.

</details>

## Submit your changes for review

If you go to your repository on GitHub, you'll see a `Compare & pull request` button. *Click on that button.*


Now submit the pull request. You can add title and any dicription if you want. Then click `create pull request`.

Soon I(Aaditya) or Himanshu will be merging all your changes into the main branch of this project. You will get a notification email once the changes have been merged.

