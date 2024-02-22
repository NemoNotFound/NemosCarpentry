path=$1
newFolderName=$2
oldName=$3
newName=$4

if [ -z "$newFolderName" ]; then
    newFolderName=$newName
fi

filter=${f//$oldName/$newName}

cd $path

for f in *
do
  if [[ "$f" == *"$oldName"* ]]
  then
    if [ ! -d "../$newFolderName" ]; then
      mkdir "../$newFolderName"
    fi
    cp $f ../$newFolderName/${f//$oldName/$newName}
  fi
done

cd ../$newFolderName
sed -i '' "s/$oldName/$newName/g" *

echo "Copied all files"
