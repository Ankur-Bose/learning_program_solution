# HOL 3 - Branching and Merging

## Objectives
- Create and merge branches.

## Steps
```bash
git checkout -b GitNewBranch
echo "Branch content" > branch.txt
git add branch.txt
git commit -m "Added branch content"
git checkout master
git merge GitNewBranch
git branch -d GitNewBranch
```
---
