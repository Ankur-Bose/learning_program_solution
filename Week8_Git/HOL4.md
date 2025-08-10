# HOL 4 - Conflict Resolution

## Steps
1. Create branch `GitWork` and add `hello.xml`.
2. Make different changes in master and branch.
3. Merge and resolve conflict using a 3-way merge tool (e.g., P4Merge).
```bash
git checkout -b GitWork
echo "<message>Hello from branch</message>" > hello.xml
git add hello.xml
git commit -m "Branch version"
git checkout master
echo "<message>Hello from master</message>" > hello.xml
git add hello.xml
git commit -m "Master version"
git merge GitWork
# Resolve conflict, then:
git add hello.xml
git commit -m "Resolved conflict"
```
---
